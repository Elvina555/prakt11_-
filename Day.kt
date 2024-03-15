enum class Day(val dayValue:Int)
{
    MONDEY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    TRURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    fun Days():String
    {
        return  when(this)
        {
            MONDEY-> "Понедельник"
            TUESDAY->"Вторник"
            WEDNESDAY->"Среда"
            TRURSDAY->"Четверг"
            FRIDAY->"Пятница"
            SATURDAY->"Суббота"
            SUNDAY->"Воскресенье"
        }
    }
    fun Dayss():String
    {
        return  when(this)
        {
            MONDEY-> "Будний день"
            TUESDAY->"Будний день"
            WEDNESDAY->"Будний день"
            TRURSDAY->"Будний день"
            FRIDAY->"Будний день"
            SATURDAY->"Выходной день"
            SUNDAY->"Выходной день"
        }
    }
    fun Plan():String
    {
        return  when(this)
        {
            MONDEY-> "Учебная пактика"
            TUESDAY->"Написание программ"
            WEDNESDAY->"Танцы на каблуках"
            TRURSDAY->"Восточные танцы"
            FRIDAY->"Репититор"
            SATURDAY->"Прогулка с друзьями"
            SUNDAY->"Зал"
        }
    }
    fun Pogovor():String
    {
        return  when(this)
        {
            MONDEY-> "Понедельник – день-бездельник"
            TUESDAY->"Вторник – повторник"
            WEDNESDAY->"Среда – тамада"
            TRURSDAY->"Четверг – все заботы я отверг"
            FRIDAY->"Пятница – пьяница"
            SATURDAY->"Суббота – не работа"
            SUNDAY->"Воскресенье – день веселья"
        }
    }
}