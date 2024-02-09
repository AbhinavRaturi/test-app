package org.fedex.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "enabled",
        "eais"
})
public class AllowList {

    @JsonProperty("enabled")
    private boolean enabled;
    @JsonProperty("eais")
    private List<String> eais;

    public AllowList() {
    }

    public AllowList(Boolean enabled, List<String> eais) {
        this.enabled = enabled;
        this.eais = eais;
    }

    @JsonProperty("enabled")
    public boolean isEnabled() {
        return this.enabled;
    }

    @JsonProperty("eais")
    public List<String> getEais() {
        return this.eais;
    }
}
