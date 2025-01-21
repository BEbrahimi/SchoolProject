/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseproject;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.List;
/**
 *
 * @author Bashir Ebrahimi
 */
public class ExportDemo {
    
   
   static List<String[]> data = new ArrayList<>();
    public static void main(String[] args) {
        data.add(new String[]{"Name", "Age", "Country"});
        data.add(new String[]{"Ali", "25", "Afghanistan"});
        data.add(new String[]{"Zahra", "30", "Iran"});
        data.add(new String[]{"John", "40", "USA"});

        // ایجاد رابط کاربری
        JFrame frame = new JFrame("Export Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JButton excelButton = new JButton("Export to Excel");
        JButton pdfButton = new JButton("Export to PDF");
        JButton printButton = new JButton("Print Data");

        excelButton.setBounds(50, 50, 150, 30);
        pdfButton.setBounds(50, 90, 150, 30);
        printButton.setBounds(50, 130, 150, 30);

        frame.add(excelButton);
        frame.add(pdfButton);
        frame.add(printButton);
        frame.setLayout(null);
        frame.setVisible(true);

        // اکشن برای دکمه‌ها
        excelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exportToExcel("output.xlsx");
            }
        });

        pdfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exportToPDF("output.pdf");
            }
        });

        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printData();
            }
        });
    }

    // متد خروجی به Excel
    private static void exportToExcel(String fileName) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Data");

            for (int i = 0; i < data.size(); i++) {
                Row row = sheet.createRow(i);
                String[] rowData = data.get(i);
                for (int j = 0; j < rowData.length; j++) {
                    Cell cell = row.createCell(j);
                    cell.setCellValue(rowData[j]);
                }
            }

            try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
                workbook.write(outputStream);
                JOptionPane.showMessageDialog(null, "Excel file created: " + fileName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // متد خروجی به PDF
    private static void exportToPDF(String fileName) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();

            PdfPTable table = new PdfPTable(data.get(0).length);
            for (String[] rowData : data) {
                for (String cellData : rowData) {
                    table.addCell(cellData);
                }
            }

            document.add(table);
            document.close();
            JOptionPane.showMessageDialog(null, "PDF file created: " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // متد چاپ داده‌ها
    private static void printData() {
        for (String[] row : data) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
