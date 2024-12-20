package core

interface ReplaceRuleInterface {
    fun match(carry: String, n:Int): Boolean;
    fun apply(carry: String, n:Int): String;
}


class NumberConverter (val rules: Array<ReplaceRuleInterface>) {
    fun convert(n:Int): MutableList<String>{
        var result: MutableList<String> = mutableListOf()
        for (i in 1..n){
            var carry: String = "";
            for (rule in this.rules){
                if(rule.match(carry,i)){
                    carry = rule.apply(carry, i)
                }
            }
            result.add(carry)
        }
        return result
    }
}