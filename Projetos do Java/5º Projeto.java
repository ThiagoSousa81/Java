import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class GeradorDeGraficos {

    public static JFreeChart generateChart(double[] data, String title, String xLabel, String yLabel) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i = 0; i < data.length; i++) {
            dataset.addValue(data[i], "Série 1", "Categoria " + (i+1));
        }
        JFreeChart chart = ChartFactory.createBarChart(title, xLabel, yLabel, dataset);
        return chart;
    }

    public static void main(String[] args) {
        double[] data = {10, 20, 30, 40};
        JFreeChart chart = generateChart(data, "Meu Gráfico", "Categorias", "Valores");
        ChartFrame frame = new ChartFrame("Gráfico", chart);
        frame.pack();
        frame.setVisible(true);
    }

}
