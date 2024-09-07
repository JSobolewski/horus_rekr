import java.util.List;

interface Cabinet {
    // zwraca dowolny element o podanej nazwie
    List<Folder>
    findFolderByName(String name);

    // zwraca wszystkie foldery podanego rozmiaru SMALL/MEDIUM/LARGE
    List<Folder> findFoldersBySize(String size);

    //zwraca liczbę wszystkich obiektów tworzących strukturę
    int count();
}
