package io.zipcoder;


public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int leftCount = 0;
        int rightCount = 0;
        for (int i = startIndex; i >= 0; i--) {
            leftCount++;
            if (i - 1 < 0) {
                i = playList.length - 1;
            }
            if (playList[i] == selection) {
                break;
            }
        }

        for (int i = 0; i <= startIndex; i++) {
            rightCount++;
            if (i + 1 > 3) {
                i = playList.length + 1;
            }

            if (playList[i] == selection) {
                break;
            }
        }
        int minNumButtonPresses = Math.min(leftCount, rightCount);
        return minNumButtonPresses;
    }
}
