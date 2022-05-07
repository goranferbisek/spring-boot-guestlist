package si.ferbisek.guestlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import si.ferbisek.guestlist.model.Guest;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {

}
