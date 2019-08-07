package com.gameplayer;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    List<String> write();
    public void read(List<String> savedValues);
}
