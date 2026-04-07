package com.easybytes.openai.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class CountryCities {

    private String country;
    private List<String> cities;

}
