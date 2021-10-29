package io.openraven.magpie.data.aws.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class JsonConverter implements AttributeConverter<JsonNode, String> {
    private static final Logger LOG = LoggerFactory.getLogger(JsonConverter.class);

    private static final ObjectMapper MAPPER = JacksonMapper.getJacksonMapper();

    @Override
    public String convertToDatabaseColumn(JsonNode jsonNode) {
        if (jsonNode == null) {
            LOG.debug("jsonNode is null return null as database column");
            return null;
        }
        return jsonNode.textValue();
    }

    @Override
    public JsonNode convertToEntityAttribute(String jsonStr) {
        if (jsonStr == null || jsonStr.isEmpty()) {
            LOG.debug("json string is empty return null as entity attribute");
        }

        try {
            return MAPPER.readTree(jsonStr);
        } catch (JsonProcessingException e) {
            LOG.error("Unable to read jsonb tree from the DB");
            return null;
        }
    }
}
