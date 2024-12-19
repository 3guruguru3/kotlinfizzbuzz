package core

interface ReplaceRuleInterface {
    fun match(carry: String, n:Int): Boolean;
    fun apply(carry: String, n:Int): String;
}


class NumberConverter (val rules: Array<ReplaceRuleInterface>) {
    fun convert(n:Int): String{
        var carry: String = "";
        for (rule in this.rules){
            if(rule.match(carry,n)){
                carry = rule.apply(carry, n)
            }
        }
        return carry;
    }
}