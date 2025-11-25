package de.seuhd.campuscoffee.domain.ports;

import de.seuhd.campuscoffee.domain.exceptions.DuplicationException;
import de.seuhd.campuscoffee.domain.exceptions.NotFoundException;
import de.seuhd.campuscoffee.domain.model.User;
import org.jspecify.annotations.NonNull;

import java.util.Collection;
import java.util.List;

public interface UserService {
    void clear();
    @NonNull List<User> getAll();
    @NonNull User getById(@NonNull Long id);
    @NonNull User getByLoginName(@NonNull String loginName);
    @NonNull User upsert(@NonNull User user);
    void delete(@NonNull Long id);
}
