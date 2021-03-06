package gov.acwi.wqp.etl.aquiferType;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import gov.acwi.wqp.etl.BaseDeleteTable;

@Component
@StepScope
public class DeleteAquiferType extends BaseDeleteTable {
	
	
	@Autowired
	public DeleteAquiferType(JdbcTemplate jdbcTemplate) {
		super(jdbcTemplate, "aquifer_type");
	}

}
