package org.pentaho.experimental.chart.plugin.jfreechart.chart.area;

import org.jfree.chart.JFreeChart;
import org.pentaho.experimental.chart.ChartDocumentContext;
import org.pentaho.experimental.chart.css.styles.ChartAreaStyle;
import org.pentaho.experimental.chart.data.ChartTableModel;

/**
 * Creates stacked area charts.
 * Author: Ravi Hasija
 * Date: May 19, 2008
 * Time: 4:37:13 PM
 */
public class JFreeStackedAreaChartGenerator extends JFreeAreaChartGenerator {
  //TODO: Not working quite right. Has spaces in the final chart that look odd.
  public JFreeChart createChart(ChartDocumentContext chartDocContext, ChartTableModel data) {
    final JFreeChart chart = createChart(chartDocContext, data, ChartAreaStyle.STACKED);

    /*
     * NOTE: The chart object will be updated.
     */
    createRangeAxis(chartDocContext, data, chart);
    return chart;
  }

}
