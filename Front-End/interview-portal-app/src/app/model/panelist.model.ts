import { Skill } from './skill.model'
import { AskPanelistMapper } from './ask_panelist_mapper.model'

export class Panelist {
    constructor(
        public panelistName: string = '', 
        public emailL: string = '', 
        public grade: string = '', 
        public contactDetail: string = '',
        public account: string = '', 
        public baseLocation: string = '', 
        public skills: Skill[] = [], 
        public mapper: AskPanelistMapper[] = []
    ) {}
}