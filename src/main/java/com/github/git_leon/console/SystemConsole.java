package com.github.git_leon.console;

public final class SystemConsole {
    private static final Console console = new Console(System.in, System.out);


    public static void print(String val, Object... args) {
        console.print(val, args);
    }

    public static void println(String val, Object... vals) {
        console.println(val, vals);
    }

    public static String getStringInput(String prompt, Object... args) {
        return console.getStringInput(prompt, args);
    }

    public static Double getDoubleInput(String prompt, Object... args) {
        return console.getDoubleInput(prompt, args);
    }

    public static Long getLongInput(String prompt, Object... args) {
        return console.getLongInput(prompt, args);
    }

    public static Integer getIntegerInput(String prompt, Object... args) {
        return console.getLongInput(prompt, args).intValue();
    }
}