package com.near.library.materialcustomspinner.models;

public class KeyPairBoolData {
    private long id;
    private IconItem icon;
    private String nameKey;
    private String name;
    private String description;
    private boolean isSelected;

    public KeyPairBoolData(){ }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public IconItem getIcon() { return icon; }
    public void setIcon(IconItem icon) { this.icon = icon; }
    public String getNameKey() { return nameKey; }
    public void setNameKey(String nameKey) { this.nameKey = nameKey; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public boolean isSelected() { return isSelected; }
    public void setSelected(boolean selected) { isSelected = selected; }

}
