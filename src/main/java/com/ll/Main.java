package com.ll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] park = {"OOOOO", "OOOOO", "OOSOO", "OOOOO", "OOOOO"};
        String[] routes = {"E 3", "W 3", "S 3", "N 3", "E 2", "E 1", "W 4", "W 1", "S 2", "S 1", "N 4", "N 1"};
        System.out.println(Arrays.toString(s.solution(park, routes)));
    }
}

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        String[][] parkDupl = new String[park.length][park[0].length()];

        // 시작 지점 찾기
        for (int i=0;i<park.length;i++) {
            for (int j=0;j<park[i].length();j++) {
                parkDupl[i][j] = park[i].charAt(j) + "";

                if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;

                    parkDupl[i][j] = "O";
                }
            }
        }

        // routes에 맞게 이동
        for (int i=0;i<routes.length;i++) {
            String direction = routes[i].split(" ")[0];
            String number = routes[i].split(" ")[1];
            int addDistance = Integer.parseInt(number);

            boolean isX = false;
            if (direction.equals("E")) {
                if (answer[1] + addDistance < parkDupl[0].length) {
                    // 목적지 지점 가기 전에 "X"가 있을 경우
                    for (int j=answer[1]+1;j<=(answer[1] + addDistance);j++) {
                        if (parkDupl[answer[0]][j].equals("X")) {
                            isX = true;
                            break;
                        }
                    }

                    if (isX) continue;

                    answer [1] += addDistance;
                }
            } else if (direction.equals("W")) {
                if (answer[1] - addDistance >= 0) {
                    // 목적지 지점 가기 전에 "X"가 있을 경우
                    for (int j=answer[1]-1;j>=(answer[1] - addDistance);j--) {
                        if (parkDupl[answer[0]][j].equals("X")) {
                            isX = true;
                            break;
                        }
                    }

                    if (isX) continue;

                    answer [1] -= addDistance;
                }
            } else if (direction.equals("S")) {
                if (answer[0] + addDistance < parkDupl.length) {
                    // 목적지 지점 가기 전에 "X"가 있을 경우
                    for (int j=answer[0]+1;j<=(answer[0] + addDistance);j++) {
                        if (parkDupl[j][answer[1]].equals("X")) {
                            isX = true;
                            break;
                        }
                    }

                    if (isX) continue;

                    answer [0] += addDistance;
                }
            } else if (direction.equals("N")) {
                if (answer[0] - addDistance >= 0) {
                    // 목적지 지점 가기 전에 "X"가 있을 경우
                    for (int j=answer[0]-1;j>=(answer[0] - addDistance);j--) {
                        if (parkDupl[j][answer[1]].equals("X")) {
                            isX = true;
                            break;
                        }
                    }

                    if (isX) continue;

                    answer [0] -= addDistance;
                }
            }
        }

        return answer;
    }
}