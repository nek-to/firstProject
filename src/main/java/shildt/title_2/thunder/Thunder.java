package shildt.title_2.thunder;

/**
 * Вычисляющую расстояние (в футах) до источника звука, возникающего из-за грозового разряда.
 * Звук распространяется в воздухе со скоростью, приблизительно равной 1100 фут/с (330 м/с).
 * Следовательно, зная промежуток времени между теми моментами, когда наблюдатель увидит вспышку молнии
 * и услышит сопровождающий ее раскат грома, можно рассчитать расстояние до нее. Допустим, что этот промежуток времени составляет 7,2 секунды.
 */
public class Thunder {
    public static void main(String[] args) {
        double time = 7.2;
        int speed = 1100;
        double res = (time * speed); //instant
//        double res = (time * speed) / 2; modifide

        System.out.println(res);
    }
}
