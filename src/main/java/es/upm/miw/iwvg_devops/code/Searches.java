package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Searches {

    public Stream<String> findUserIdByAllProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream().allMatch(Fraction::isProper))
                .map(User::getId);
    }

    public Stream<String> findUserFamilyNameBySomeImproperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream().anyMatch(Fraction::isImproper))
                .map(User::getFamilyName)
                .distinct();
    }

    public Stream<String> findUserNameBySomeImproperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream().anyMatch(Fraction::isImproper))
                .map(User::getName)
                .distinct();
    }
}