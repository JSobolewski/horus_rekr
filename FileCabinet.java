import java.util.List;

public class FileCabinet implements Cabinet {
    private List<Folder> folders;

    @Override
    public List<Folder> findFolderByName(String name) {
        List<Folder> foundFolders = null;
        for(int i = 0; i < folders.size(); i++) {
            if(folders.get(i).getName().equals(name))
                foundFolders.add(folders.get(i));
        }

        return foundFolders;
    }

    @Override
    public List<Folder> findFoldersBySize(String size) {
        List<Folder> foundFolders = null;
        for(int i = 0; i < folders.size(); i++) {
            if(folders.get(i).getSize().equals(size))
                foundFolders.add(folders.get(i));
        }

        return foundFolders;
    }

    @Override
    public int count() {
        return folders.size();
    }
}
