package gui;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class FilesFound {

    private JFileChooser dialog;

    public FilesFound() {
        UIManager.put("FileChooser.setButtonText", "Сохранить");
        UIManager.put("FileChooser.cancelButtonText", "отмена");
        UIManager.put("FileChooser.fileNameLabelText", "Наименование файла");
        UIManager.put("FileChooser.filesOfTypeLabelText", "Тип файлов");
        UIManager.put("FileChooser.lookInLabelText", "Директория");
        UIManager.put("FileChooser.saveInLabelText", "Сохранить в директории");
        UIManager.put("FileChooser.folderNameLabelText", "Путь директории");
        UIManager.put("FileChooser.openButtonText", "Открыть");
        UIManager.put("FileChooser.openDialogTitleText", "Открыть");
        UIManager.put("FileChooser.newFolderToolTipText", "Создать новую директорию");
        UIManager.put("FileChooser.listViewButtonToolTipText", "Лист");
        UIManager.put("FileChooser.detailsViewButtonToolTipText", "Детально");
        UIManager.put("FileChooser.homeFolderToolTipText", "Робочий стол");
        UIManager.put("FileChooser.newFolderErrorText", "Ошибка при создании директории");
        UIManager.put("FileChooser.acceptAllFileFilterText", "Все файлы");
        UIManager.put("FileChooser.directoryOpenButtonText", "Выбрать");
    }

    public File createDialogFrame() {
        dialog = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        dialog.setDialogTitle("Выбор файлов");
        int returnValue = dialog.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selected = dialog.getSelectedFile();
            System.out.println(selected.getAbsolutePath());
            return selected;
        }
        System.out.println("Dialog frame created.");
        return null;
    }
}
