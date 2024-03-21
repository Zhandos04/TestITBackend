package com.epam.java_basic.array_processor;

/**
 *  Useful methods for array processing
 */
public class ArrayProcessor {

    public int[] swapMaxNegativeAndMinPositiveElements(int[] input) {
        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;
        int indexN = 0;
        int indexP = 0;
        for (int i = 0; i < input.length; i++) {
            if(input[i] > 0) {
                if(input[i] < minPositive) {
                    minPositive = input[i];
                    indexP = i;
                }
            }else if(input[i] < 0) {
                if(input[i] > maxNegative) {
                    maxNegative = input[i];
                    indexN = i;
                }
            }
        }
        int temp = input[indexP];
        input[indexP] = input[indexN];
        input[indexN] = temp;
        return input;
    }

    public int countSumOfElementsOnEvenPositions(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if(i % 2 == 0) {
                sum += input[i];
            }
        }
        return sum;
    }

    public int[] replaceEachNegativeElementsWithZero(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if(input[i] < 0) {
                input[i] = 0;
            }
        }
        return input;
    }

    public int[] multiplyByThreeEachPositiveElementStandingBeforeNegative(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            if(input[i] > 0 && input[i + 1] < 0) {
                input[i] *= 3;
            }
        }
        return input;
    }

    public float calculateDifferenceBetweenAverageAndMinElement(int[] input) {
        double arifsum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < input.length; i++) {
            arifsum += input[i];
            min = Math.min(min, input[i]);
        }
        arifsum /= input.length;
        return (float) Math.abs(arifsum - min);
    }

    public int[] findSameElementsStandingOnOddPositions(int[] input) {
        int[] ans = new int[input.length];
        int cnt = 0;
        boolean check = false;
        for (int i = 0; i < input.length - 1; i++) {
            int element = input[i];
            for (int j = i + 1; j < input.length; j++) {
                if(input[j] == element) {
                    if(i % 2 != 0 || j % 2 != 0) {
                        if(cnt == 0) {
                            check = true;
                        } else {
                            for (int k = 0; k < cnt + 1; k++) {
                                if(ans[k] == element) {
                                    break;
                                }else if(k == cnt) {
                                    check = true;
                                }
                            }
                        }

                        if(check) {
                            ans[cnt] = element;
                            cnt++;
                            check = false;
                            break;
                        }
                    }
                }
            }
        }
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = ans[i];
        }
        return arr;
    }
}
