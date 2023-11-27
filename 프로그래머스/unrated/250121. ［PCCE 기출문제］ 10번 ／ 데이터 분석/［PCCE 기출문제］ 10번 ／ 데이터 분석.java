import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
       int[][] answer = {};
        int int_Ext = stringToInt(ext);
        int int_sort_by = stringToInt(sort_by);
        ArrayList<Data> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            new Data(i, data[i][0], data[i][1], data[i][2], data[i][3]);
            switch (int_Ext){
                case 0 :
                    if (data[i][0] < val_ext) list.add(new Data(i, data[i][0], data[i][1], data[i][2], data[i][3]));
                    break;
                case 1 :
                    if (data[i][1] < val_ext) list.add(new Data(i, data[i][0], data[i][1], data[i][2], data[i][3]));
                    break;
                case 2 :
                    if (data[i][2] < val_ext) list.add(new Data(i, data[i][0], data[i][1], data[i][2], data[i][3]));
                    break;
                case 3 :
                    if (data[i][3] < val_ext) list.add(new Data(i, data[i][0], data[i][1], data[i][2], data[i][3]));
                    break;
            }
        }
        answer = new int[list.size()][];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = new int[]{list.get(i).code, list.get(i).date, list.get(i).maximum, list.get(i).remain};
        }
        Arrays.sort(answer, Comparator.comparingInt(arr -> arr[int_sort_by]));
        return answer;
    }
    int stringToInt(String s){
        switch (s){
            case "code": return 0;
            case "date":return 1;
            case "maximum":return 2;
            case "remain" : return 3;
            default: return 4;
        }
    }
    class Data {
        int index;
        int code;
        int date;
        int maximum;
        int remain;

        public Data(int index, int code, int date, int maximum, int remain) {
            this.index = index;
            this.code = code;
            this.date = date;
            this.maximum = maximum;
            this.remain = remain;
        }
    }
}