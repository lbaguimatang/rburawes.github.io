package io.flp.core.domain;
import org.springframework.roo.addon.dbre.RooDbManaged;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.json.RooJson;

@RooJavaBean
@RooJpaActiveRecord(table = "account", schema = "public")
@RooDbManaged(automaticallyDelete = true)
@RooToString(excludeFields = { "userRoles" })
@RooJson
public class Account {
}
