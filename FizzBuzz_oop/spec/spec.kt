package spec

import core.ReplaceRuleInterface

// 倍数に関するルール
class CyclicNumberRule(val base: Int, val replacement: String): ReplaceRuleInterface{
    override fun match(carry: String, n: Int): Boolean{
        return n % this.base == 0;
    }

    override fun apply(carry: String, n: Int): String{
        return "${carry}${this.replacement}";
    }
}

// 倍数じゃないときのルール
class PassThroughRule(): ReplaceRuleInterface{
    override fun match(carry: String, n: Int): Boolean{
        return carry == "";
    }

    override fun apply(carry: String, n: Int): String{
        return "${n}";
    }
}