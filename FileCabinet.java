import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FileCabinet implements Cabinet {
    private List<Folder> folders;

    @Override
    public Optional<Folder> findFolderByName(String name) {
        Optional<Folder> foundFolder = Optional.empty();
        for(Folder folder : folders) {
            if(folder.getName().equals(name))
                foundFolder = Optional.of(folder);
        }

        return foundFolder;
    }

    @Override
    public List<Folder> findFoldersBySize(String size) {
        List<Folder> foundFolders = new ArrayList<>();
        for(Folder folder : folders) {
            if(folder.getSize().equals(size))
                foundFolders.add(folder);
        }

        return foundFolders;
    }

    @Override
    public int count() {
        int count = 0;
        for(Folder folder : folders) {
            count++;
        }
        return count;
    }
}
