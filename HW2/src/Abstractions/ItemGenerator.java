package Abstractions;

// Абстракция класса фабрикии
public abstract class ItemGenerator {
    // метод взаимодействия с абстрактным итемом
    // return: содержмое из разных сундуков
    public String openReward(){
        IGameItem gameItem = createItem();
        return gameItem.open();
    }

    // метод создания экземпляра продукта
    // return: экземпляр продукта
    public abstract IGameItem createItem();
}
