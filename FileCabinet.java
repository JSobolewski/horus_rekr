import java.util.List;

public class FileCabinet implements Cabinet {
    private List<Folder> folders;

    @Override
    public List<Folder> findFolderByName(String name) {
        List<Folder> foundFolders = null;
        for(Folder folder : folders) {
            if(folder.getName().equals(name))
                foundFolders.add(folder);
        }

        return foundFolders;
    }

    @Override
    public List<Folder> findFoldersBySize(String size) {
        List<Folder> foundFolders = null;
        for(Folder folder : folders) {
            if(folder.getSize().equals(size))
                foundFolders.add(folder);
        }

        return foundFolders;
    }

    @Override
    public int count() {
        return folders.size();
    }
}
