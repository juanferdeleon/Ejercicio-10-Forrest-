package People

import candies.RandomBox

class ForestGump <T> (val life: RandomBox<T>, var isRunning: Boolean = false) {
    fun runForest(){
        this.isRunning.not()
    }
    fun talkForest(): String{
        val picked = life.pickOne()
        if (picked == null){
            return ":("
        }
        return "La vida es como una caja de chocolates. \n $picked"
    }
}