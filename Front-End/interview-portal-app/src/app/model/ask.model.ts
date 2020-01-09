import { Skill } from './skill.model';
import { Interview } from './interview.model'
import { AskPanelistMapper } from './ask_panelist_mapper.model';

export class Ask {
    constructor(
        public skill: Skill = new Skill(),
        public interviewDetails: Interview[] = [],
        public interviewDate: Date = null,
        public mapper: AskPanelistMapper[] = []
    ) {} 
}