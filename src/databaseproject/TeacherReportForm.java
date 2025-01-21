
package databaseproject;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class TeacherReportForm extends JFrame {
    public TeacherReportForm() {
        // Frame setup
        setTitle("Teacher Report Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Main panel
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Create buttons
        JButton btnPrint = new JButton("Print");
        JButton btnPDF = new JButton("PDF");
        JButton btnWord = new JButton("Word");
        JButton btnExcel = new JButton("Excel");

        // Add buttons to a top panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnPrint);
        buttonPanel.add(btnPDF);
        buttonPanel.add(btnWord);
        buttonPanel.add(btnExcel);

        mainPanel.add(buttonPanel, BorderLayout.NORTH);

        // Table with mock data
        String[] columns = {"TeacherID", "Name", "Father Name", "Address", "Education Level", "Subject", "Salary", "Date of Birth", "Gender", "Contact", "Email"};
        Object[][] data = {
            {"T01", "Ali", "Hassan", "Kabul", "Master", "Math", "50000", "1980-05-15", "Male", "1234567890", "ali@gmail.com"},
            {"T02", "Sara", "Karim", "Herat", "Bachelor", "English", "45000", "1990-10-25", "Female", "9876543210", "sara@gmail.com"}
        };
        DefaultTableModel tableModel = new DefaultTableModel(data, columns);
        JTable table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Add action listeners for buttons
        btnPrint.addActionListener(e -> {
            try {
                table.print(); // Print table
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error while printing: " + ex.getMessage());
            }
        });

        btnPDF.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save as PDF");
            int userSelection = fileChooser.showSaveDialog(null);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
//                saveAsPDF(table, fileToSave.getAbsolutePath() + ".pdf");
            }
        });

        btnWord.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save as Word");
            int userSelection = fileChooser.showSaveDialog(null);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                saveAsWord(table, fileToSave.getAbsolutePath() + ".docx");
            }
        });

        btnExcel.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save as Excel");
            int userSelection = fileChooser.showSaveDialog(null);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                saveAsExcel(table, fileToSave.getAbsolutePath() + ".xlsx");
            }
        });

        // Add main panel to frame
        add(mainPanel);
        setVisible(true);
    }

//    private void saveAsPDF(JTable table, String filePath) {
//        try (Document document = new Document()) {
//            PdfWriter.getInstance(document, new FileOutputStream(filePath));
//            document.open();
//
//            PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
//            // Add table headers
//            for (int i = 0; i < table.getColumnCount(); i++) {
//                PdfPCell cell = new PdfPCell(new Phrase(table.getColumnName(i)));
//                pdfTable.addCell(cell);
//            }
//
//            // Add table rows
//            for (int rows = 0; rows < table.getRowCount(); rows++) {
//                for (int cols = 0; cols < table.getColumnCount(); cols++) {
//                    pdfTable.addCell(table.getValueAt(rows, cols).toString());
//                }
//            }
//
//            document.add(pdfTable);
//            JOptionPane.showMessageDialog(null, "PDF file saved successfully at: " + filePath);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error saving PDF: " + e.getMessage());
//        }
//    }

    private void saveAsWord(JTable table, String filePath) {
        try (XWPFDocument document = new XWPFDocument()) {
            org.apache.poi.xwpf.usermodel.XWPFTable wordTable = document.createTable();

            // Add headers
            org.apache.poi.xwpf.usermodel.XWPFTableRow headerRow = wordTable.getRow(0);
            for (int i = 0; i < table.getColumnCount(); i++) {
                if (i == 0) {
                    headerRow.getCell(0).setText(table.getColumnName(i));
                } else {
                    headerRow.addNewTableCell().setText(table.getColumnName(i));
                }
            }

            // Add rows
            for (int rows = 0; rows < table.getRowCount(); rows++) {
                org.apache.poi.xwpf.usermodel.XWPFTableRow tableRow = wordTable.createRow();
                for (int cols = 0; cols < table.getColumnCount(); cols++) {
                    tableRow.getCell(cols).setText(table.getValueAt(rows, cols).toString());
                }
            }

            try (FileOutputStream out = new FileOutputStream(filePath)) {
                document.write(out);
            }

            JOptionPane.showMessageDialog(null, "Word file saved successfully at: " + filePath);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error saving Word: " + e.getMessage());
        }
    }

    private void saveAsExcel(JTable table, String filePath) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Teacher Report");

            // Add headers
            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < table.getColumnCount(); i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(table.getColumnName(i));
            }

            // Add rows
            for (int rows = 0; rows < table.getRowCount(); rows++) {
                Row excelRow = sheet.createRow(rows + 1);
                for (int cols = 0; cols < table.getColumnCount(); cols++) {
                    Cell cell = excelRow.createCell(cols);
                    cell.setCellValue(table.getValueAt(rows, cols).toString());
                }
            }

            try (FileOutputStream out = new FileOutputStream(filePath)) {
                workbook.write(out);
            }

            JOptionPane.showMessageDialog(null, "Excel file saved successfully at: " + filePath);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error saving Excel: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TeacherReportForm::new);
    }
}
