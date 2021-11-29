package mx.brayan.partida.repository.profile;

import java.text.MessageFormat;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.core.query.TextQuery;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import org.springframework.validation.MessageCodeFormatter;

import mx.brayan.partida.model.profile;

@Repository
public class profileRepositoryQuery {
	@Autowired
	MongoTemplate mongoTemplate;

	private static final Logger log = LoggerFactory.getLogger(profileRepositoryQuery.class);

	public profileRepositoryQuery(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	/**
	 * obti
	 * 
	 * @param phone
	 * @return
	 */
	public List<profile> findByPhoneNumber(String phone) {
		Query findPhone = new Query().addCriteria(Criteria.where("phone_number_id").is(phone));
		return mongoTemplate.find(findPhone, profile.class);

	}

	/**
	 * 
	 * @param phone
	 * @return mongoTemplate
	 */
	public List<profile> findByPhoneNumberFreeText(String phone) {
		TextCriteria phoneFree = TextCriteria.forDefaultLanguage().matching(phone);
		Query query = TextQuery.queryText(phoneFree);
		return this.mongoTemplate.find(query, profile.class);

	}

	/**
	 * 
	 * @param phone
	 * @param profileBody
	 * @return
	 */
	public String updatePhoneNumber(String phone, profile profileBody) {
		String[] websites = profileBody.getWebsites();
		if (websites.length > 2) {
			return "no se puede tener mas de dos websites";
		}
		Query query = new Query(Criteria.where("phone_number_id").is(phone));
		Update update = new Update().set("address", profileBody.getAddress())
				.set("description", profileBody.getDescription()).set("websites", websites);

		mongoTemplate.updateFirst(query, update, profile.class);
		String queryInfo = MessageFormat.format("this is query", query);
		log.info(queryInfo);
		return "se actualizo el registro";
	}

	/**
	 * selecciona la phone and email
	 * 
	 * @param phone
	 * @param Email
	 * @return
	 */
	public List<profile> selectPhoneAndMail(String phone, String Email) {
		Query query = new Query(Criteria.where("phone_number_id").is(phone).and("email").is(Email));
		return mongoTemplate.find(query, profile.class);

	}

}
