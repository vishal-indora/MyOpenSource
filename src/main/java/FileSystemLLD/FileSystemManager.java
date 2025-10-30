package FileSystemLLD;

import org.checkerframework.checker.units.qual.N;

public class FileSystemManager {
    // I will create files/directory using this, I will have root
    private FileSystemNode root;

    FileSystemManager(){
        this.root = new Directory("/");
    }

    public boolean isValidPath(String path) {
        return path != null && path.startsWith("/");
    }

    // create path /document/dir1/file1.txt
    public void createPath(String path) {
        if(!isValidPath(path)) {
            System.out.println("Invalid path");
            return;
        }
        FileSystemNode tmp = root;

        String[] Nodes = path.split("/");
        for(int i=0;i<Nodes.length-1;i++){
            // all of these are directories
            if(!tmp.hasChild(Nodes[i])) {
                FileSystemNode toBeNode = new Directory(Nodes[i]);
                tmp.addChild(toBeNode);
            }
            tmp = tmp.getChild(Nodes[i]);
        }
        String fileName = Nodes[Nodes.length-1];
        if(!tmp.hasChild(fileName)){
            tmp.addChild(new File(fileName));
        }
    }

    public FileSystemNode getNode(String path) {
        if(!isValidPath(path)) {
            System.out.println("Invalid path");
            return null;
        }
        FileSystemNode tmp = root;

        String[] Nodes = path.split("/");
        for(int i=0;i<Nodes.length;i++){
            if(tmp.hasChild(Nodes[i])){
                tmp = tmp.getChild(Nodes[i]);
            } else{
                // this path doesn't exist
                return null;
            }
        }
        return tmp;
    }
}
