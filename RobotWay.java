package com.tech.day;

public class RobotWay {
    public int countWays(int x, int y) {
        if ( x==1 || y==1 )
            return 1;
        return countWays(x-1,y)+countWays(x,y-1);
    }
}
