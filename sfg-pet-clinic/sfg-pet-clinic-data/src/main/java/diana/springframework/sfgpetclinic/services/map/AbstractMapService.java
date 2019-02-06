package diana.springframework.sfgpetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import diana.springframework.sfgpetclinic.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

	protected Map<Long, T> map = new HashMap<>();

	Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	T findById(ID id) {
		return map.get(id);
	}
	T save(T object) {
		if (object != null) {
			if (object.getId() == null)
				object.setId(nextId());

			map.put(object.getId(), object);
		}
		return object;
	}

	void deleteById(ID id) {
		map.remove(id);
	}
	void delete(T object) {
		map.entrySet().removeIf(e -> e.getValue().equals(object));
	}

	private Long nextId() {
		return map.isEmpty() ? 1 : Collections.max(map.keySet()) + 1;
	}
}
