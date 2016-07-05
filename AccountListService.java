package com.lexmark.mps.api.services;

import java.util.List;
import java.util.Map;

public interface AccountListService {

    /**
     * Return all L5 account IDs the user is allowed to see.
     *
     * @param filter
     *
     * This method expects accountId and accountLevel params in the filter
     */
    public List<String> getL5List(Map<String, String> filter);

    /**
     * Return all L5 account IDs the user is allowed to see.
     */
    public List<String> getL5List();

    /**
     * Return L5 account IDs under the passed Account that user is allowed to see.
     *
     * @param accountId
     * @param level
     */
    public List<String> getL5List(String accountId, String level);

    /**
     * Return whether the currently logged in user has access to a requested L5
     *
     * @param accountId
     */
    public boolean userHasL5(String accountId);

    /**
     * Return CHL account IDs for the logged in user
     */
    public List<String> getChlList();

    /**
     * Return whether the currently logged in user has access to a requested CHL
     *
     * @param chlId
     */
    public boolean userHasChl(String chlId);
}
