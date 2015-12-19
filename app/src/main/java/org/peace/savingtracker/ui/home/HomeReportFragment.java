package org.peace.savingtracker.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import butterknife.OnClick;
import org.peace.savingtracker.R;
import org.peace.savingtracker.ui.history.ExpenseHistoryActivity;

/**
 * Created by peacepassion on 15/12/19.
 */
public class HomeReportFragment extends BaseHomeFragment {

  public static HomeReportFragment newInstance() {
    return new HomeReportFragment();
  }

  @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    setTitle(R.string.expense_report);
  }

  @Override protected int getLayoutRes() {
    return R.layout.fragment_home_report;
  }

  @OnClick(R.id.view_expense_history) public void checkExpenseHistory() {
    startActivity(new Intent(activity, ExpenseHistoryActivity.class));
  }
}