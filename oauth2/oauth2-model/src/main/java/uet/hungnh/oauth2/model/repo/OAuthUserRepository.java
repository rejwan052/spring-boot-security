package uet.hungnh.oauth2.model.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uet.hungnh.oauth2.model.entity.OAuthUser;

@Repository
public interface OAuthUserRepository extends CrudRepository<OAuthUser, String> {
}
