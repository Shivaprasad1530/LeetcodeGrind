class Solution {
    public String intToRoman(int num) {
        StringBuilder str = new StringBuilder();
        int thousands = num / 1000;
        if (thousands > 0) {
            String T = "M";
            str.append(T.repeat(thousands));
            num = num - thousands * 1000;
        }
        int hund = num / 100;
        String H = "C";
        if (hund > 0) {
            if (hund == 4) {
                str.append("CD");
            } else if (hund == 9) {
                str.append("CM");
            } else if (hund >= 5) {
                str.append('D');
                str.append(H.repeat(hund - 5));
            } else {
                str.append(H.repeat(hund));
            }
            num = num - hund * 100;
        }
        int tens = num / 10;
        String Te = "X";
        if (tens > 0) {
            if (tens == 4) {
                str.append("XL");
            } else if (tens == 9) {
                str.append("XC");
            } else if (tens >= 5) {
                str.append('L');
                str.append(Te.repeat(tens - 5));
            } else {
                str.append(Te.repeat(tens));
            }
            num = num - tens * 10;
        }
        int ones = num;
        String O = "I";
        if (ones == 4) {
            str.append("IV");
        } else if (ones == 9) {
            str.append("IX");
        } else if (ones >= 5) {
            str.append('V');
            str.append(O.repeat(ones - 5));
        } else {
            str.append(O.repeat(ones));
        }
        return str.toString();
    }
}