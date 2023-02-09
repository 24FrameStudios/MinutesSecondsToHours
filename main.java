public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(60, 63));
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int hours = minutes / 60;

            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;

            return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        }
        else {
            return "Invalid";
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes >= 0) && (seconds >= 0)) {
            int totalSeconds = (minutes * 60) + seconds;
            int newMinutes = totalSeconds / 60;
            int newHours = newMinutes / 60;

            int remainingMinutes = newMinutes % 60;
            int remainingSeconds = totalSeconds % 60;

            return newHours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        }
        else {
            return "Invalid";
        }
    }

}
