class Solution {
    final int LEAD_1 = 0;
    final int LEAD_2 = 2;  // 10
    final int LEAD_3 = 6;  // 110
    final int LEAD_4 = 14; // 1110
    final int LEAD_5 = 30; // 11110

    public boolean validUtf8(int[] data) {
        int i = 0, counter = 0, bytesCount = 0;
        boolean started = false;

        while (i < data.length) {
            if (!started) {
                started = true;
                counter = 0;

                switch (extractLead(data[i])) {
                    case LEAD_1:
                        bytesCount = 0;
                        started = false;
                        break;
                    case LEAD_3:
                        bytesCount = 1;
                        break;
                    case LEAD_4:
                        bytesCount = 2;
                        break;
                    case LEAD_5:
                        bytesCount = 3;
                        break;
                    default:
                        return false;
                }

                i++;
            } else {
                while (i < data.length && extractLead(data[i]) == LEAD_2) {
                    counter++;
                    i++;
                }

                if (counter != bytesCount) {
                    return false;
                }

                started = false;
            }
        }

        return (counter == bytesCount) ? true : false;
    }

    public int extractLead(int octet) {
        if (octet >> 7 == 0) {
            return this.LEAD_1;
        } else if (octet >> 6 == 2) {
            return this.LEAD_2;
        } else if (octet >> 5 == 6) {
            return this.LEAD_3;
        } else if (octet >> 4 == 14) {
            return this.LEAD_4;
        } else if (octet >> 3 == 30) {
            return this.LEAD_5;
        }

        return -1;
    }
}