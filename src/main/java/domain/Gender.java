package domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The gender.
 *
 * @author QNH
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum Gender {
    male,
    female,
    unknown,
    not_applicable
}
