package session_20.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem_4 {
    public static void main(String[] args) {
        List<Map<LocalDate, String>> entries = new ArrayList<>();

        Map<LocalDate, String> entryMap = new HashMap<>();
        entryMap.put(LocalDate.now(),"Hello World!");
        entryMap.put(LocalDate.now().minusDays(1),"This title");
        entryMap.put(LocalDate.now().minusDays(2),"Hello journal");

        entries.add(entryMap);

        Diary diary = new Diary(entries);

        LocalDate searchDate = LocalDate.now().minusDays(1);
        Map<LocalDate, String> diaryMap = diary.getEntries().get(0);
        String diaryContent = diaryMap.get(searchDate);
        System.out.println(diaryContent);

    }
}
