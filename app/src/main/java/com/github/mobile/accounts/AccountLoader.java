package com.github.mobile.accounts;

import android.accounts.Account;
import android.content.Context;

import com.github.mobile.persistence.AccountDataManager;
import com.google.inject.Inject;

import org.eclipse.egit.github.core.User;

import java.util.List;

/**
 * Created by riakira on 17/1/16.
 * use AccountLoader as a independent class so that in case of violation of SRP
 */

public  class AccountLoader extends
        AuthenticatedUserTask<List<User>> {

    @Inject
    private AccountDataManager cache;

    protected AccountLoader(Context context) {
        super(context);
    }

    @Override
    protected List<User> run(Account account) throws Exception {
        return cache.getOrgs(true);
    }
}
