package info.androidhive.navigationdrawer.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

import info.androidhive.navigationdrawer.R;

/**
 * Created by Irvan Fathul Huda on 12/29/2017.
 */

public class ChartActivity extends AppCompatActivity {
    PieChart pieChart;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.fragment_home);
        pieChart = (PieChart) findViewById(R.id.piechart);

        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5, 10, 5, 5);

        pieChart.setDragDecelerationFrictionCoef(0.95f);

        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(Color.WHITE);
        pieChart.setTransparentCircleRadius(61f);

        ArrayList<PieEntry> yValues = new ArrayList<>();

        yValues.add(new PieEntry(34f, "Januari"));
        yValues.add(new PieEntry(23f, "Februari"));
        yValues.add(new PieEntry(14f, "Maret"));
        yValues.add(new PieEntry(15f, "April"));
        yValues.add(new PieEntry(35f, "Mei"));
        yValues.add(new PieEntry(32f, "Juni"));
        yValues.add(new PieEntry(36f, "Juli"));
        yValues.add(new PieEntry(40f, "Agustus"));

        PieDataSet dataSet = new PieDataSet(yValues, "Bulan");;
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);
        dataSet.setColors(ColorTemplate.JOYFUL_COLORS);

        PieData data = new PieData((dataSet));
        data.setValueTextSize(10f);
        data.setValueTextColor(Color.YELLOW);

        pieChart.setData(data);

    }
}
