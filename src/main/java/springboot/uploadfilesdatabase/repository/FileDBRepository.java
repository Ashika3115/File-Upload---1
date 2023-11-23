package springboot.uploadfilesdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.uploadfilesdatabase.model.FileDB;

public interface FileDBRepository extends JpaRepository<FileDB, String>{

}
