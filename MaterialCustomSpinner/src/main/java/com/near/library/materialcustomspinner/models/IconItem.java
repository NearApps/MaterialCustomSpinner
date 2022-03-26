package com.near.library.materialcustomspinner.models;

import com.near.library.materialcustomspinner.R;

public class IconItem {
    private int icon = R.drawable.default_border;
    private String description;
    private int tint;

    public IconItem(int icon, String description, int tint) {
        this.icon = icon;
        this.description = description;
        this.tint = tint;
    }

    public int getIcon() { return icon; }
    public void setIcon(int icon) { this.icon = icon; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public int getTint() { return tint; }
    public void setTint(int tint) { this.tint = tint; }
}
