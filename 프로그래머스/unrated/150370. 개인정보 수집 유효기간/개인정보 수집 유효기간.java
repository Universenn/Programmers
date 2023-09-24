import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
               // 저장
        ArrayList<Integer> list = new ArrayList<>();

        // rank 를 map으로 저장
        Map<String, Integer> rank = new HashMap<>();
        for (String term : terms) {
            String[] s = term.split(" ");
            rank.put(s[0], Integer.valueOf(s[1]));
        }

        // today 를 localDate 로 parse 해준다.
        LocalDate localDateToday = LocalDate.parse(today.replace('.', '-'), DateTimeFormatter.ISO_DATE);
        for (int i = 0; i < privacies.length; i++) {
            // 날짜와 랭크를 나눈다
            String[] s = privacies[i].split(" ");

            // 비교할 수 있게 LocalDate 로 parse 해주고, 약관의 종류에 따라 월을 plus 해준다. day -1 을 해줘야 날짜가 맞다.
            LocalDate temp = LocalDate.parse(s[0].replace('.', '-'), DateTimeFormatter.ISO_DATE).plusMonths(rank.get(s[1])).minusDays(1);
            System.out.println(i + " = "+temp);

            // temp 가 localDateToday 보다 더 작으면 페기 list 추가
            if(temp.isBefore(localDateToday)){
                list.add(i+1);
            };

        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}