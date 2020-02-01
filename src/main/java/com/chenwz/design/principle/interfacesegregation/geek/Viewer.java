package com.chenwz.design.principle.interfacesegregation.geek;

import java.util.Map;

public interface Viewer {
    String outputInPlainText();
    Map<String, String> output();
}
