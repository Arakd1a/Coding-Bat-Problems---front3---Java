public String front3(String str) {
    int size = str.length();
    if (str.equals("")) {
        return str;
    }
    if (size == 2 || size == 1) {
        String result = str + str + str;
        return result;

    } else {
        StringBuilder sb = new StringBuilder(str);
        String firstThree = sb.substring(0, 3);
        String result = firstThree + firstThree + firstThree;
        return result;
    }

}
