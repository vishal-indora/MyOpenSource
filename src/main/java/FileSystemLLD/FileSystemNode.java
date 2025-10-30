package FileSystemLLD;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public abstract class FileSystemNode {
    private String name;

    private Map<String, FileSystemNode> children;

    private final LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, FileSystemNode> getChildren() {
        return children;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }


    FileSystemNode(String name){
        this.name = name;
        children = new HashMap<>();
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }


    // methods to add, remove, check child
    public void addChild(FileSystemNode child){
        children.put(child.getName(), child);
        this.setUpdatedAt(LocalDateTime.now());
    }

    public boolean hasChild(String child) {
        return children.containsKey(child);
    }

    public FileSystemNode getChild(String name) {
        return children.get(name);
    }


    public boolean removeChild(String name) {
        if(children.containsKey(name)) {
            children.remove(name);
            return true;
        }
        return false;
    }

    // file level method
    public abstract boolean isFile();
    public abstract void display(int depth);
}
