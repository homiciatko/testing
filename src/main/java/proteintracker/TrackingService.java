package proteintracker;

import proteintracker.HistoryItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawel on 2018-01-06.
 */
public class TrackingService {

    private int total;
    private int goal;
    private List<HistoryItem> history = new ArrayList<>();
    private int historyId = 0;


    public void addProtein(int amount) {
        total += amount;
        history.add(new HistoryItem(historyId++, amount, "add", total));
    }

    public void removeProtein(int amount) {
        total -= amount;
        if(total < 0)
            total = 0;

        history.add(new HistoryItem(historyId++, amount, "remove", total));
    }


    public List<HistoryItem> getHistory() {
        return history;
    }
    public int getGoal() {
        return goal;
    }
    public void setGoal(int goal) {
        this.goal = goal;
    }
    public int getTotal() {
        return total;
    }
}
