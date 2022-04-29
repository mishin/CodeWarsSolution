/*
package main.com.streams;

@Service
public class DbTransactionTest {
    @Transactional
    public DataObject methodA(DataObject data) {
        methodB(data);
        throw new RuntimeException();
        @Transactional(propagation = Propagation.REQUIRES_NEW) public DataObject methodB (DataObject data){
            repository.save(data);
            return data;
        }
    }
}*/
