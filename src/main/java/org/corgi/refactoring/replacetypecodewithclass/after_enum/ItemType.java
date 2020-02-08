package org.corgi.refactoring.replacetypecodewithclass.after_enum;

public enum ItemType {

    BOOK(0),
    DVD(1),
    SOFT(2);

    private final int typeCode;

    private ItemType(int typeCode) {
        this.typeCode = typeCode;
    }

    public int getTypeCode() {
        return this.typeCode;
    }
}
